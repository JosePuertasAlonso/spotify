import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-interprete';

@customElement('vista-interpretes')
export class VistaInterpretes extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" theme="spacing-s" id="vL_contenedorInterpretes">
 <vista-interprete style="width: 100%;" id="vistaInterprete"></vista-interprete>
 <vista-interprete style="width: 100%;" id="vistaInterprete1"></vista-interprete>
 <vista-interprete style="width: 100%;" id="vistaInterprete2"></vista-interprete>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
