import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-perfil_administrador';

@customElement('vista-lista_de_perfiles_ver_todo_administrador')
export class VistaLista_de_perfiles_ver_todo_administrador extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background:#121212; width: 100%; height: 100%;" theme="spacing" id="vL_contenedorPerfilAdministrador">
 <vista-perfil_administrador style="width: 100%;" id="vistaPerfil_administrador"></vista-perfil_administrador>
 <vista-perfil_administrador style="width: 100%;" id="vistaPerfil_administrador1"></vista-perfil_administrador>
 <vista-perfil_administrador style="width: 100%;" id="vistaPerfil_administrador2"></vista-perfil_administrador>
 <vista-perfil_administrador style="width: 100%;" id="vistaPerfil_administrador3"></vista-perfil_administrador>
 <vista-perfil_administrador style="width: 100%;" id="vistaPerfil_administrador4"></vista-perfil_administrador>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
