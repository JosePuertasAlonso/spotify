import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-artista_administrador';

@customElement('vista-lista_de_artistas_ver_todo_administrador')
export class VistaLista_de_artistas_ver_todo_administrador extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; width: 100%; height: 100%;" theme="spacing" id="vL_contenedorArtistaAdministrador">
 <vista-artista_administrador style="width: 100%;" id="vistaArtista_administrador"></vista-artista_administrador>
 <vista-artista_administrador style="width: 100%;" id="vistaArtista_administrador1"></vista-artista_administrador>
 <vista-artista_administrador style="width: 100%;" id="vistaArtista_administrador2"></vista-artista_administrador>
 <vista-artista_administrador style="width: 100%;" id="vistaArtista_administrador3"></vista-artista_administrador>
 <vista-artista_administrador style="width: 100%;" id="vistaArtista_administrador4"></vista-artista_administrador>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
