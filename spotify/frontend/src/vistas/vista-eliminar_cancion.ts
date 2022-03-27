import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-eliminar_cancion')
export class VistaEliminar_cancion extends LitElement {
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
<vaadin-vertical-layout style="background-color:#121212; width: 100%; height: 100%; padding: var(--lumo-space-xl); align-items: center; border:none; border: 2px solid #A8A8A8; justify-content: center;" class="fuentes boton-rectangulo" theme="spacing" id="vL_fondo">
 <label style="flex-shrink: 0; align-self: center; text-align:center;" id="label_eliminar">Eliminar canción</label>
 <label style="flex-shrink: 0; align-self: center; font-weight: 300; font-size:" id="label_atencion">¡Atención! va a eliminar la canción "nombre canción"</label>
 <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; align-self: center; align-items: center; justify-content: center; margin-top: var(--lumo-space-l);" id="hL_botones">
  <button style="align-self: center;" id="button_siEliminar">SÍ, ELIMINAR CANCIÓN</button>
  <button style="align-self: center;" id="button_cancelar">CANCELAR</button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
