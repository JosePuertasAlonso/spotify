import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera';

@customElement('vista-dar_de_baja_perfil')
export class VistaDar_de_baja_perfil extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color:#121212;" class="fuentes boton-rectangulo" theme="spacing" id="vL_fondo">
 <vista-cabecera style="width: 100%; height: 10%;" id="vistaCabecera"></vista-cabecera>
 <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_eliminarPerfil">Eliminar perfil</label>
 <label style="flex-shrink: 0; align-self: center; margin-top: var(--lumo-space-xl); max-width: 30%; text-align:center;" id="label_atencion">¡Atención! si confirma la eliminación del perfil este desaparecerá definitivamente en 30 días.</label>
 <label style="flex-shrink: 0; align-self: center; font-weight: 300; font-size:" id="label_continuar">¿Desea continuar?</label>
 <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; align-self: center; align-items: center; justify-content: center; margin-top: var(--lumo-space-l);" id="hL_botones">
  <button style="align-self: center; width: 100%; max-width: 15%;" id="button_siEliminar">SÍ, ELIMINAR PERFIL</button>
  <button style="align-self: center; width: 100%; max-width: 15%;" id="button_noVolver">NO, VOLVER A MI PERFIL</button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
