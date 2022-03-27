import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-artista';

@customElement('vista-artistas_similares')
export class VistaArtistas_similares extends LitElement {
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
<vaadin-vertical-layout style="background-color:#121212; align-items: flex-start; max-height: 100%; width: 100%; height: 100%;" theme="spacing" id="vL_fondo">
 <vaadin-horizontal-layout theme="spacing" id="hL_contenedorArtistas">
  <vista-artista id="vistaArtista"></vista-artista>
  <vista-artista id="vistaArtista1"></vista-artista>
  <vista-artista id="vistaArtista2"></vista-artista>
  <vista-artista id="vistaArtista3"></vista-artista>
  <vista-artista id="vistaArtista4"></vista-artista>
  <vista-artista id="vistaArtista5"></vista-artista>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
