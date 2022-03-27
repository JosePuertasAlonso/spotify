import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cancion_album';

@customElement('vista-canciones_del_album_administrador')
export class VistaCanciones_del_album_administrador extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; width: 100%; height: 100%;" theme="spacing" id="vL_contenedorCancionesAlbum">
 <vista-cancion_album style="width: 100%;" id="vistaCancion_album"></vista-cancion_album>
 <vista-cancion_album style="width: 100%;" id="vistaCancion_album1"></vista-cancion_album>
 <vista-cancion_album style="width: 100%;" id="vistaCancion_album2"></vista-cancion_album>
 <vista-cancion_album style="width: 100%;" id="vistaCancion_album3"></vista-cancion_album>
 <vista-cancion_album style="width: 100%;" id="vistaCancion_album4"></vista-cancion_album>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
