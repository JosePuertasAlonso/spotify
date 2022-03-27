import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cancion_administrador';

@customElement('vista-lista_de_canciones_ver_todo_administrador')
export class VistaLista_de_canciones_ver_todo_administrador extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; width: 100%; height: 100%;" theme="spacing" id="vL_contenedorCancionAdministrador">
 <vista-cancion_administrador style="width: 100%;" id="vistaCancion_administrador"></vista-cancion_administrador>
 <vista-cancion_administrador style="width: 100%;" id="vistaCancion_administrador1"></vista-cancion_administrador>
 <vista-cancion_administrador style="width: 100%;" id="vistaCancion_administrador2"></vista-cancion_administrador>
 <vista-cancion_administrador style="width: 100%;" id="vistaCancion_administrador3"></vista-cancion_administrador>
 <vista-cancion_administrador style="width: 100%;" id="vistaCancion_administrador4"></vista-cancion_administrador>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
