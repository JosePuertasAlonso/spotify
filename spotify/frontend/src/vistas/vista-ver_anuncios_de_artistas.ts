import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver_anuncios_de_artistas')
export class VistaVer_anuncios_de_artistas extends LitElement {
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
 <vaadin-vertical-layout style="max-height: 100%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); overflow-y:scroll; width: 100%; height: 100%;" id="vL_cuerpo">
  <label style="align-self: flex-start; font-size: 2.5rem; flex-shrink: 1;" id="label_anunciosArtistas">Anuncios de artistas a los que sigues</label>
  <vaadin-horizontal-layout theme="spacing-s" style="width: 100%; margin-bottom: var(--lumo-space-m);" id="hL_anunciosSinLeerNumero">
   <label style="flex-shrink: 0; align-self: flex-start;" id="label_anunciosSinLeer">Anuncios sin leer :</label>
   <label style="color:#A8A8A8; font-weight:400; align-self: flex-end;" id="label_nAnuncios">123</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="hL_contenedorAnuncios" style="max-height: 15%; width: 100%;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
