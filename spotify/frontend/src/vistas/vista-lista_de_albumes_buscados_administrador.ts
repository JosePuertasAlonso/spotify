import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-album_administrador';

@customElement('vista-lista_de_albumes_buscados_administrador')
export class VistaLista_de_albumes_buscados_administrador extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; width: 100%; height: 100%;" theme="spacing" id="vL_contenedorAlbumesAdministrador">
 <vista-album_administrador style="width: 100%;" id="vistaAlbum_administrador"></vista-album_administrador>
 <vista-album_administrador style="width: 100%;" id="vistaAlbum_administrador1"></vista-album_administrador>
 <vista-album_administrador style="width: 100%;" id="vistaAlbum_administrador2"></vista-album_administrador>
 <vista-album_administrador style="width: 100%;" id="vistaAlbum_administrador3"></vista-album_administrador>
 <vista-album_administrador style="width: 100%;" id="vistaAlbum_administrador4"></vista-album_administrador>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}