import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-estilo';

@customElement('vista-estilos')
export class VistaEstilos extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; width: 100%; height: 100%;" id="vL_contendorEstilos">
 <vista-estilo style="width: 100%;" id="vistaEstilo"></vista-estilo>
 <vista-estilo style="width: 100%;" id="vistaEstilo1"></vista-estilo>
 <vista-estilo style="width: 100%;" id="vistaEstilo2"></vista-estilo>
 <vista-estilo style="width: 100%;" id="vistaEstilo3"></vista-estilo>
 <vista-estilo style="width: 100%;" id="vistaEstilo4"></vista-estilo>
 <vista-estilo style="width: 100%;" id="vistaEstilo6"></vista-estilo>
 <vista-estilo style="width: 100%;" id="vistaEstilo5"></vista-estilo>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
