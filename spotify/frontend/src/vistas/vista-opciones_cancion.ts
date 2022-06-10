import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-opciones_cancion')
export class VistaOpciones_cancion extends LitElement {
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
<vaadin-vertical-layout style="background-color:#121212; width: 100%; height: 100%; align-items: center; border:none; border: 2px solid #A8A8A8; justify-content: center; margin-left: 0px; margin-right: 0px; padding: var(--lumo-space-l); padding-bottom: var(--lumo-space-xl);" class="fuentes boton-rectangulo" theme="spacing-l" id="vL_fondo">
 <label style="flex-shrink: 0; width: 100%; align-self: center; text-align:center; margin-top: 0px;" id="label_opciones">Opciones</label>
 <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; align-items: center; justify-content: center;" id="hL_botonesImagen">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; max-width: 40%; align-items: flex-end; justify-content: center;" id="vL_botones">
   <button style="width: 100%; max-width: 100%; align-self: center;" id="button_reproducir">REPRODUCIR CANCIÓN</button>
   <button style="align-self: center; width: 100%;" id="button_anadirFavoritos">AÑADIR A FAVORITOS</button>
   <button style="align-self: center; width: 100%;" id="button_anadirLista">AÑADIR A LISTA</button>
   <button style="align-self: center; width: 100%;" id="button_verArtista">VER ARTISTA</button>
   <button style="align-self: center; width: 100%;" id="button_verAlbum">VER ÁLBUM</button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing-xs" style="max-width: 27%; width: 100%;" id="vL_imagen">
   <img style="border-radius: 0.7rem; align-self: center; max-width: 100%; display:none" src="https://i.scdn.co/image/ab67616d0000b273b808f59ccba69a0afcaa79bc" theme="" id="imagen">
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
