import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-crear_lista_de_reproduccion')
export class VistaCrear_lista_de_reproduccion extends LitElement {
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

    button{
    	font-size:12px
    }

    button:hover{
    	font-size: 13px;
    }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%; overflow-y:scroll" class="fuentes" id="vL_fondo">
 <vaadin-vertical-layout theme="spacing" style="max-height: 100%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); height: 100%; width: 100%; max-width: 40%; align-self: center;" id="vL_cuerpo" class="botones-cabecera">
  <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_creaLista">Crea una lista de reproducción</label>
  <label style="flex-shrink: 0;" id="label_titulo">Ponle un título a la lista de reproducción</label>
  <input type="email" placeholder="Pon el título de la lista de reproducción" style="width: 100%; padding: 10px;" id="input_titulo">
  <vaadin-vertical-layout theme="spacing-l" class="botonlabel" style="max-width: 30%; width: 100%; align-items: center; align-self: center;" id="vL_imagen">
   <img style="max-width: 90%; max-height: 90%; border-radius:0%; border: 2px solid #FFFFFF;" src="/img/song.png" id="imagen">
   <span class="input_file"><input type="file" name="input_file" id="input_file" style="display:none" accept="image/*"></span>
   <label for="input_file" id="labelinput_file" style="color:#121212; background-color:#FFFFFF; border-radius:500px; display: flex; align-items: center; cursor:pointer; padding: 8px 34px; letter-spacing: 1.76px; padding-top: 12px; padding-bottom: 12px; justify-content: center; width: 100%; margin-top: var(--lumo-space-xs);">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#121212" style="padding-right: var(--lumo-space-s);">
     <path d="M0 0h24v24H0V0z" fill="none"></path>
     <path d="M18 20H4V6h9V4H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-9h-2v9zm-7.79-3.17l-1.96-2.36L5.5 18h11l-3.54-4.71zM20 4V1h-2v3h-3c.01.01 0 2 0 2h3v2.99c.01.01 2 0 2 0V6h3V4h-3z"></path>
    </svg><span>ELEGIR FOTO</span></label>
  </vaadin-vertical-layout>
  <button style="color:#000000; background-color:#FFFFFF; max-height: 8.5%; max-width: 41%; margin-top: var(--lumo-space-l);" id="button_crearLista" class="registro">CREAR LISTA</button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
