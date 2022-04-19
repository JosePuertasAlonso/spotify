import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver_todas_canciones_buscadas_administrador')
export class VistaVer_todas_canciones_buscadas_administrador extends LitElement {
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

      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%; margin: 0px; padding: var(--lumo-space-l);" class="fuentes" id="vL_fondo">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; overflow-y:scroll; padding-bottom: 0px; margin-bottom: 0px; margin: 0px; max-height: 100%;" id="vL_cuerpo">
  <label style="align-self: center; font-size: 2.5rem; flex-shrink: 1;" id="label_buscaModifica">Busca y modifica elementos</label>
  <vaadin-horizontal-layout theme="spacing" id="hL_barraBuscador" style="max-height: 6%; max-width: 50%; width: 100%; height: 100%; align-self: center;"></vaadin-horizontal-layout>
  <label style="font-size: 1.5rem; line-height: 1.75rem; letter-spacing: -0.04em; text-transform: none; font-weight: 700; color:#FFFFFF; flex-shrink: 0; margin-top: var(--lumo-space-xl);" id="label_todasLasCancionesPara">Todas las canciones para "busqueda"</label>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; max-height: 13%; height: 100%; margin: 0px;" id="hL_listaDeCancionesVerTodoAdmin"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
