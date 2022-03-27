import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera';
import './vista-reproductor_resumido';
import './vista-cancion';
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
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%; " class="fuentes" id="vL_fondo">
 <vista-cabecera style="width: 100%; height: 10%;" id="vistaCabecera"></vista-cabecera>
 <vaadin-vertical-layout theme="spacing-xl" style="max-height: 80%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); width: 100%; height: 100%;" id="vL_cuerpo">
  <label style="align-self: center; font-size: 2.5rem; flex-shrink: 1;" id="label_misEstadisticas">Mis estadísticas</label>
  <vaadin-horizontal-layout theme="spacing-xl" style="max-height: 80%; width: 100%; align-self: center; align-items: flex-start; justify-content: center;" id="hL_estadisticas">
   <vaadin-vertical-layout theme="spacing" style="max-width: 16%;" id="vL_cancionMasEscuchada">
    <label style="<label style=&quot;font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; width: 100%; &quot; id=&quot;tituloL&quot;>?lbumes</label>; align-self: center;" id="label_cancionMasEscuchada">Canción más escuchada:</label>
    <vista-cancion style="max-width: 100%;" id="vistaCancion"></vista-cancion>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="margin-left: 100px; width: 100%; max-width: 16%;" id="vL_datosUsuario">
    <label style="<label style=&quot;font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; width: 100%; &quot; id=&quot;tituloL&quot;>Álbumes</label>; align-self: center;" id="label_nombreUsuario">Nombre usuario</label>
    <img style="border-radius:50%; border: 2px solid #FFFFFF; max-width: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/2048px-User-avatar.svg.png" id="imagen">
    <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="hL_seguidores">
     <label style="flex-shrink: 0; align-self: flex-start;" id="label_seguidores">Seguidores:</label>
     <label style="color:#A8A8A8; font-weight:400; align-self: flex-end;" id="label_nSeguidores">123</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="max-width: 16%; margin-left: 100px;" id="vL_ultimaReproduccion">
    <label style="<label style=&quot;font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; width: 100%; &quot; id=&quot;tituloL&quot;>?lbumes</label>; align-self: center;" id="label_ultimaReproduccion">Última reproducción:</label>
    <vista-cancion style="max-width: 100%;" id="vistaCancion1"></vista-cancion>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vista-reproductor_resumido style="width: 100%; height: 10%;" id="vistaReproductor_resumido"></vista-reproductor_resumido>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
