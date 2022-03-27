import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-ultimos_exitos';
import './vista-cabecera';
import './vista-reproductor_resumido';
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
 <vista-cabecera style="max-height: 10%; width: 100%;" id="vistaCabecera"></vista-cabecera>
 <vaadin-horizontal-layout theme="spacing" style="max-height: 80%; width: 100%; height: 100%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l);" id="hL_ultimosExitos">
  <vista-ultimos_exitos style="width: 100%; max-width: 100%; height: auto;" id="vistaUltimos_exitos"></vista-ultimos_exitos>
 </vaadin-horizontal-layout>
 <vista-reproductor_resumido style="max-height: 10%; width: 100%;" id="vistaReproductor_resumido"></vista-reproductor_resumido>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
