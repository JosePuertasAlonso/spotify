import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver_todos_los_artistas_buscados')
export class VistaVer_todos_los_artistas_buscados extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" class="fuentes" id="vL_fondo">
 <vaadin-vertical-layout theme="spacing" style="max-height: 100%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); width: 100%; height: 100%; overflow-y:scroll;" id="vL_cuerpo">
  <vaadin-horizontal-layout theme="spacing" id="hL_barraBuscador" style="max-width: 100%; max-height: 7%; width: 50%;"></vaadin-horizontal-layout>
  <label style="align-self: flex-start; font-size: 2.5rem; flex-shrink: 1;" id="label_todosArtistasPara">Todos los artistas para "busqueda"</label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
