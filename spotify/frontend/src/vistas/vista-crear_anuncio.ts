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
   <input type="text" placeholder="Pon un título a tu anuncio." style="width: 100%; padding: 10px;" id="input_titulo">
   <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_descripcion">Descripción del anuncio</label>
   <textarea type="text" placeholder="Escribe la descripción del anuncio" style="width: 100%; padding: 10px; height: 100%;" id="textarea_descripcion1"></textarea>
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
