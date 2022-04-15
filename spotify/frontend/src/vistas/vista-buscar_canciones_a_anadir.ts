import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-buscar_canciones_a_anadir')
export class VistaBuscar_canciones_a_anadir extends LitElement {
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

    .fuentes label {
    	font-size: 1.3rem;
    	letter-spacing: -0.04em;
    	font-weight: 700; 
    	color:#FFFFFF;
    	}

      .boton-rectangulo button {
    		border:none; 
    		background:none;
    		border: 1px solid #A8A8A8;
    		border-radius: 5px;
    		cursor: pointer; 
    		color: #FFFFFF;
    		align-self: center;
    		font-size: 0.875rem;
    		padding: 7px 15px;
      }

      .boton-rectangulo button:hover {
    		border: 1px solid #FFFFFF; 

      }

      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" class="fuentes boton-rectangulo" id="vL_fondo">
 <vaadin-vertical-layout theme="spacing-l" style="max-height: 100%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); overflow-y:scroll; width: 100%; height: 100%;" id="vL_cuerpo">
  <label style="align-self: flex-start; font-size: 2.5rem; flex-shrink: 1; margin: 0px; padding-left: var(--lumo-space-m);" id="label_anadeCancion">Añade una canción a la lista "nombre lista"</label>
  <vaadin-horizontal-layout style="width: 100%; justify-content: space-between; margin: 0px; max-height: 7%; margin-top: var(--lumo-space-m);" id="hL_anadeCancionVolver">
   <vaadin-horizontal-layout theme="spacing" id="hL_barraBuscador" style="max-width: 100%; max-height: 100%; width: 50%;"></vaadin-horizontal-layout>
   <button style="align-self: center; width: 100%; max-width: 10%;" id="button_volver">VOLVER</button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="hL_todasCancionesNuevaCancion">
   <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; width: 100%;" id="label_todasCancionesPara">Todas las canciones para "búsqueda"</label>
   <button style="align-self: center; width: 100%; max-width: 10%;" id="button_nuevaCancion">NUEVA CANCIÓN</button>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; max-height: 16%; height: 100%; margin: 0px;" id="vL_cancionesBuscadasAAnadir"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
