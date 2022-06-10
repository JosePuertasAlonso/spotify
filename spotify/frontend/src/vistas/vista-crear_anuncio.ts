import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-crear_anuncio')
export class VistaCrear_anuncio extends LitElement {
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

    .fuentes input {
    	color: #FFFFFF;
    	font-size: 1.1rem;
    	border: 1px solid #FFFFFF;
    	background-color:#121212;
    	outline-color: #FFFFFF;
    }

    .fuentes input::placeholder {
    	color:#A8A8A8;
    }

    .fuentes textarea {
    	color: #FFFFFF;
    	font-size: 1.1rem;
    	font-family: helvetica;
    	border: 1px solid #FFFFFF;
    	background-color:#121212;
    	outline-color: #FFFFFF;
    }

    .fuentes textarea::placeholder {
    	color:#A8A8A8;
    }

      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color:#121212;" class="fuentes" id="vL_fondo">
 <vaadin-vertical-layout theme="spacing" style="max-height: 100%; height: 100%; width: 100%; margin: 0px;" id="vL_cuerpo" class="boton_modificar">
  <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_creaNuevoAnuncio">Crea un nuevo anuncio</label>
  <vaadin-vertical-layout style="max-width: 60%; width: 100%; margin-right: var(--lumo-space-xl); max-height: 70%; height: 100%; align-self: center; margin-top: var(--lumo-space-xl);" theme="spacing" id="vL_tituloDescripcion">
   <label style="flex-shrink: 0;" id="label_titulo">Ponle un título a tu anuncio</label>
   <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorTitulo">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
     <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
    </svg>No se puede crear un anuncio sin título</label>
   <input type="text" placeholder="Pon un título a tu anuncio." style="width: 100%; padding: 10px;" id="input_titulo">
   <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_descripcion">Descripción del anuncio</label>
   <input type="text" id="input_textArea" style="width: 100%; text-align: center; height: 100%;" placeholder="Escribe la descripción del anuncio">
   <textarea type="text" placeholder="Escribe la descripción del anuncio" style="width: 100%; padding: 10px; height: 100%; display:none" id="textarea_descripcion1"></textarea>
  </vaadin-vertical-layout>
  <button id="button_publicarAnuncio" style="margin-bottom: var(--lumo-space-m); width: 100%; max-width: 16%;">PUBLICAR ANUNCIO</button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
