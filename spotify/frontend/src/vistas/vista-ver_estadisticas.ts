import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver_estadisticas')
export class VistaVer_estadisticas extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .fuentes label {
    	font-size: 1.3rem;
    	letter-spacing: -0.04em;
    	font-weight: 700; 
    	color:#FFFFFF;
    	}
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%; margin-top: 0px; padding: 0px;" class="fuentes" id="vL_fondo">
 <vaadin-vertical-layout theme="spacing-xl" style="max-height: 100%; padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); width: 100%; height: 100%; padding-top: 0px; padding: 0px; margin: 0px;" id="vL_cuerpo">
  <label style="align-self: center; font-size: 2.5rem; flex-shrink: 1; margin-top: 0px;" id="label_misEstadisticas">Mis estadísticas</label>
  <vaadin-horizontal-layout theme="spacing-xl" style="max-height: 80%; width: 100%; align-self: center; justify-content: center; align-items: flex-start;" id="hL_estadisticas">
   <vaadin-vertical-layout theme="spacing" style="max-width: 20%; margin-top: 0px; width: 100%;" id="vL_cancionMasEscuchada">
    <label style="width: 100%; margin-bottom: var(--lumo-space-m);" id="label_cancionMasEscuchada">Canción más escuchada:</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="margin-left: 100px; width: 100%; max-width: 20%; margin-top: 0px;" id="vL_datosUsuario">
    <label style="align-self: center;" id="label_nombreUsuario">Nombre usuario</label>
    <img style="border-radius:50%; border: 2px solid #FFFFFF; max-width: 100%;" id="imagen">
    <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="hL_seguidores">
     <label style="flex-shrink: 0; align-self: flex-start;" id="label_seguidores">Seguidores:</label>
     <label style="color:#A8A8A8; font-weight:400; align-self: flex-end;" id="label_nSeguidores">123</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="max-width: 20%; margin-left: 100px; margin-top: 0px; width: 100%;" id="vL_ultimaReproduccion">
    <label style="margin-bottom: var(--lumo-space-m);" id="label_ultimaReproduccion">Canción favorita</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
