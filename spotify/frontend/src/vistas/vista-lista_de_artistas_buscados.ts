import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-artista_lista';

@customElement('vista-lista_de_artistas_buscados')
export class VistaLista_de_artistas_buscados extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; width: 100%; height: 100%;" theme="spacing" id="vL_contenedorArtistaLista">
 <vista-artista_lista style="width: 100%;" id="vistaArtista_lista"></vista-artista_lista>
 <vista-artista_lista style="width: 100%;" id="vistaArtista_lista1"></vista-artista_lista>
 <vista-artista_lista style="width: 100%;" id="vistaArtista_lista2"></vista-artista_lista>
 <vista-artista_lista style="width: 100%;" id="vistaArtista_lista3"></vista-artista_lista>
 <vista-artista_lista style="width: 100%;" id="vistaArtista_lista4"></vista-artista_lista>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
