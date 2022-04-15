import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-administrador')
export class VistaAdministrador extends LitElement {
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
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" id="vL_fondo">
 <vaadin-horizontal-layout theme="spacing" id="hL_cabecera" style="width: 100%; height: 100%; max-height: 10%; margin: 0px;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center; justify-content: flex-start; height: 100%; max-height: 100%; padding: var(--lumo-space-xl);" id="vL_cuerpo" class="fuentes boton-rectangulo">
  <label style="align-self: center; font-size: 2.5rem; flex-shrink: 1; margin-bottom: var(--lumo-space-s);" id="label_anadeElementos">Añade nuevos elementos</label>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; align-self: center; align-items: center; justify-content: center;" id="hL_botones">
   <button style="align-self: center; width: 100%; max-width: 15%; margin-left: var(--lumo-space-xl); margin-right: var(--lumo-space-xl);" id="button_anadirEstilo">AÑADIR ESTILO</button>
   <button style="align-self: center; width: 100%; max-width: 15%; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);" id="button_anadirCancion">AÑADIR CANCIÓN</button>
   <button style="align-self: center; width: 100%; max-width: 15%; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);" id="button_anadirAlbum">AÑADIR ÁLBUM</button>
   <button style="align-self: center; width: 100%; max-width: 15%; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);" id="button_anadirArtista">AÑADIR ARTISTA</button>
  </vaadin-horizontal-layout>
  <label style="align-self: center; font-size: 2.5rem; flex-shrink: 1; margin-top: 125px; margin-bottom: var(--lumo-space-s);" id="label_buscaElementos">Busca y modifica elementos</label>
  <vaadin-horizontal-layout theme="spacing" id="hL_barraBuscador" style="max-height: 7%; max-width: 50%; width: 100%; height: 100%; align-self: center;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
