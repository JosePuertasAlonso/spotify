import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-lista_a_anadir')
export class VistaLista_a_anadir extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .label-lista label {
    	font-size: 1rem;
    	line-height: 1.5rem;
    	text-transform: none;
    	letter-spacing: normal;
    	font-weight: 700;

    }

    input[type="checkbox"]{
    	appearance: none;
    	-webkit-appearance: none;
    	height: 25px;
    	width: 25px;
    	background-color:#181818;
    	border: 1px solid #FFFFFF;
    	cursor:pointer;
    }


    input[type="checkbox"]:hover{
    	background-color:#121212;
    }

    input[type="checkbox"]:checked{
    	background-color:#1ED760;
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
<vaadin-horizontal-layout class="content" style="background-color:#181818; width: 100%; height: 100%; align-items: center; justify-content: space-between; max-width: 100%; max-height: 100%;" id="hL_fondo">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; margin: 0px;" id="hL_imagenTitulo">
  <img style="max-height: 100%; max-width: 100%; margin: 0px;" id="imagen">
  <vaadin-vertical-layout class="label-lista" style="align-self: center; width: 100%; height: 100%; align-items: center; justify-content: center; flex-direction: column; display: flex; align-items: center;" id="vL_tituloCreador">
   <label style="align-self: flex-start; color:#FFFFFF; width: 100%;" id="label_titulo">Pop con Ñ Clásicos</label>
   <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="label_creador">Creador</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing-s" style="align-self: center; height: 100%; align-items: center; justify-content: flex-end; margin-right: var(--lumo-space-l);" class="boton-rectangulo" id="hL_nCancionesAnadir">
  <label style="align-self: center; color:#9D9D9D; font-weight: 400; margin-right: var(--lumo-space-m);" id="label_nCanciones">(n/100)</label>
  <button style="align-self: center;" id="button_anadir">AÑADIR</button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
