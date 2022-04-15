import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-cibernauta_no_registrado')
export class VistaCibernauta_no_registrado extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" id="vL_fondo">
 <vaadin-horizontal-layout theme="spacing" id="hL_cabecera" style="max-height: 10%; width: 100%; margin: 0px;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="max-height: 80%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); max-width: 100%; height: 100%; width: 100%; overflow-y:scroll" id="hL_ultimosExitos"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="hL_minireproductor" style="max-height: 10%; width: 100%; margin: 0px;"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
