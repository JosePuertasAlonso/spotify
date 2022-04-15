import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver_creditos_cancion')
export class VistaVer_creditos_cancion extends LitElement {
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
<vaadin-vertical-layout style="background-color:#121212; overflow-y:scroll; width: 100%; height: 100%; padding: var(--lumo-space-xl); align-items: center;" class="fuentes" theme="spacing" id="vL_fondo">
 <vaadin-horizontal-layout theme="spacing" id="hL_titulo">
  <label style="flex-shrink: 0; align-self: flex-start;" id="label_titulo">Título:</label>
  <label style="color:#A8A8A8; font-weight:400; align-self: flex-end;" id="label_titulo1">titulo</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="hL_album">
  <label style="flex-shrink: 0; align-self: flex-start;" id="label_album">Álbum:</label>
  <label style="color:#A8A8A8; font-weight:400; align-self: flex-end;" id="label_album1">album</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="hL_compositores">
  <label style="flex-shrink: 0; align-self: flex-start;" id="label_compositores">Compositores:</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="hL_productores">
  <label style="flex-shrink: 0; align-self: flex-start;" id="label_productores">Productores:</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="hL_interpretes">
  <label style="flex-shrink: 0; align-self: flex-start;" id="label_interpretes">Intérpretes:</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
