import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ultimos_exitos')
export class VistaUltimos_exitos extends LitElement {
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
<vaadin-vertical-layout style="background-color:#121212; align-items: flex-start; max-height: 100%; width: 100%; height: auto;" theme="spacing" id="vL_fondo">
 <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; width: 100%; max-height: 5%;" id="label_ultimosExitos">Ultimos éxitos</label>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; max-height: 95%; margin-right: var(--lumo-space-m); width: 100%; max-width: 100%;" id="vL_filasCanciones">
  <vaadin-horizontal-layout theme="spacing" style="max-height: 50%; " id="hL_contenedorCanciones"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
