import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-compositor';

@customElement('vista-compositores')
export class VistaCompositores extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" theme="spacing-s" id="vL_contenedorCompositores">
 <vista-compositor style="width: 100%;" id="vistaCompositor"></vista-compositor>
 <vista-compositor style="width: 100%;" id="vistaCompositor1"></vista-compositor>
 <vista-compositor style="width: 100%;" id="vistaCompositor2"></vista-compositor>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
