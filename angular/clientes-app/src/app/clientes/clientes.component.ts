import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteService } from './cliente.service';
import { ModalService } from './detalle/modal.service';
import swal from 'sweetalert2';
import { tap } from 'rxjs/operators';
import { ActivatedRoute } from '@angular/router';
import { AuthService } from '../usuarios/auth.service';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html'
})
export class ClientesComponent implements OnInit {

  clientes: Cliente[];
  paginador: any;
  clienteSeleccionado:Cliente;

  constructor(private clienteService: ClienteService,
  private modalService: ModalService,
  public authService: AuthService,
  private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {

    this.activatedRoute.paramMap.subscribe( params => {
    let page: number = +params.get('page');

    if (!page){
      page = 0;
    }
    this.clienteService.getClientes(page).pipe(
      tap(response =>{
      console.log('ClienteService: tap 3');
      (response.content as Cliente[]).forEach( cliente => {
      console.log(cliente.nombre);
    });
  })).subscribe(
      (response) => {
        this.clientes = response.content as Cliente[];
        this.paginador= response;
      }
    );
    }
    );
    this.modalService.notificarUpload.subscribe(cliente => {
      this.clientes = this.clientes.map(clienteOriginal => {
        if(cliente.id == clienteOriginal.id){
          clienteOriginal.foto = cliente.foto;
        }
        return clienteOriginal;
      })
    })
    console.log('clientes: ' + JSON.stringify(this.clientes));
  }

  delete(cliente: Cliente): void{
    const swalWithBootstrapButtons = swal.mixin({
    customClass: {
      confirmButton: 'btn btn-success',
      cancelButton: 'btn btn-danger'
    },
    buttonsStyling: false
  })

  swalWithBootstrapButtons.fire({
    title: 'Está seguro?',
    text: `¿Seguro que desea eliminar al cliente ${cliente.nombre} ${cliente.apellido}?`,
    icon: 'warning',
    showCancelButton: true,
    confirmButtonText: 'Yes, delete it!',
    cancelButtonText: 'No, cancel!',
    reverseButtons: true
  }).then((result) => {
    if (result.isConfirmed) {

      this.clienteService.delete(cliente.id).subscribe(
        response =>{
          this.clientes = this.clientes.filter(cli => cli !== cliente)
          swal.fire(
            'Deleted!',
            `Cliente ${cliente.nombre} eliminado con éxito.`,
            'success'
          )
        }
      )
    }
  })
  }

  abrirModal(cliente: Cliente){
    this.clienteSeleccionado = cliente;
    this.modalService.abrirModal();
  }
}
