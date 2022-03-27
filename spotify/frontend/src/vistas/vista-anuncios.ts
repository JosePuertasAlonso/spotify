import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-anuncio';

@customElement('vista-anuncios')
export class VistaAnuncios extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; width: 100%; height: 100%;" theme="spacing" id="vL_contenedorAnuncios">
 <vista-anuncio id="vistaAnuncio"></vista-anuncio>
 <vista-anuncio id="vistaAnuncio1"></vista-anuncio>
 <vista-anuncio id="vistaAnuncio2"></vista-anuncio>
 <vista-anuncio id="vistaAnuncio3"></vista-anuncio>
 <vista-anuncio></vista-anuncio>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
