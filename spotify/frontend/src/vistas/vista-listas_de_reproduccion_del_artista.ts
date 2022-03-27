import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-lista_del_artista';

@customElement('vista-listas_de_reproduccion_del_artista')
export class VistaListas_de_reproduccion_del_artista extends LitElement {
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
<vaadin-vertical-layout style="background-color:#121212; align-items: flex-start; max-height: 100%; width: 100%; height: 100%;" theme="spacing" id="vL_listaFilas">
 <vaadin-horizontal-layout theme="spacing" id="hL_contenedorListaDelArtista">
  <vista-lista_del_artista id="vistaLista_del_artista"></vista-lista_del_artista>
  <vista-lista_del_artista id="vistaLista_del_artista1"></vista-lista_del_artista>
  <vista-lista_del_artista id="vistaLista_del_artista2"></vista-lista_del_artista>
  <vista-lista_del_artista id="vistaLista_del_artista3"></vista-lista_del_artista>
  <vista-lista_del_artista id="vistaLista_del_artista4"></vista-lista_del_artista>
  <vista-lista_del_artista></vista-lista_del_artista>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
