import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-comun')
export class VistaComun extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

::-webkit-scrollbar {
	width: 8px;
}

::-webkit-scrollbar-thumb {
	background: #414141;
	background: #A8A8A8;
	border-radius: 5px;
}
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" id="vL_fondo">
 <vaadin-horizontal-layout theme="spacing" id="hL_cabecera" style="max-height: 10%; width: 100%; margin: 0px;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="vL_cuerpo" style="padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); max-width: 100%; width: 100%; margin: 0px; height: 100%; max-height: 80%;">
  <vaadin-vertical-layout theme="spacing" style="flex-shrink: 1; width: 100%; height: 100%; max-height: 100%; overflow-y:scroll; max-width: 100%; padding: 0px;" id="vL_contendorListasCanciones">
   <vaadin-horizontal-layout theme="spacing" id="hL_buscador" style="max-width: 100%; max-height: 7%; width: 50%;"></vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="hL_minireproductor" style="max-height: 10%; width: 100%;"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
