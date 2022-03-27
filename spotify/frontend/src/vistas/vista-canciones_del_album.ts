import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cancion_lista';

@customElement('vista-canciones_del_album')
export class VistaCanciones_del_album extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; width: 100%; height: 100%;" theme="spacing" id="vL_contenedorCancionesLista">
 <vista-cancion_lista style="width: 100%;" id="vistaCancion_lista"></vista-cancion_lista>
 <vista-cancion_lista style="width: 100%;" id="vistaCancion_lista1"></vista-cancion_lista>
 <vista-cancion_lista style="width: 100%;" id="vistaCancion_lista2"></vista-cancion_lista>
 <vista-cancion_lista style="width: 100%;" id="vistaCancion_lista3"></vista-cancion_lista>
 <vista-cancion_lista style="width: 100%;" id="vistaCancion_lista4"></vista-cancion_lista>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
