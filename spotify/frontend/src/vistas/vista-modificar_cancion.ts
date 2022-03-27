import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera';

@customElement('vista-modificar_cancion')
export class VistaModificar_cancion extends LitElement {
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

    .botonlabel label{
    	font-size:12px;
    }

    .botonlabel label:hover{
    	font-size:13px;
    }

    button {
    	font-size: 12px;
    }

    button:hover {
    	font-size: 13px;
    }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color:#121212;" class="fuentes" id="vL_fondo">
 <vista-cabecera style="width: 100%; max-height: 10%;" id="vistaCabecera"></vista-cabecera>
 <vaadin-vertical-layout theme="spacing" style="max-height: 80%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); height: 100%; width: 100%;" id="vL_cuerpo">
  <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_anadeNuevaCancion">Añade una nueva canción</label>
  <vaadin-horizontal-layout theme="spacing-xl" style="max-width: 55%; align-self: center; margin-top: var(--lumo-space-xl); margin-bottom: var(--lumo-space-m); width: 100%; justify-content: center;" id="hL_datosCancion">
   <vaadin-vertical-layout style="max-width: 70%; width: 100%; margin-right: var(--lumo-space-xl);" theme="spacing" id="vL_cancion">
    <label style="flex-shrink: 0;" id="label_titulo">Título de la canción</label>
    <input type="email" placeholder="Pon un título a la cancion." style="padding: 10px; width: 100%;" id="input_titulo">
    <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_artista">Artista(s) de la canción</label>
    <input type="email" placeholder="Pon el artista(s) de la canción." style="width: 100%; padding: 10px;" id="input_artista">
    <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_album">Álbum de la canción</label>
    <input type="email" placeholder="Pon el álbum de la canción." style="width: 100%; padding: 10px;" id="input_album">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing-l" class="botonlabel" style="max-width: 30%; width: 100%; align-items: center; align-self: center; max-height: 100%;" id="vL_cancion1">
    <label style="flex-shrink: 0; height: 100%; width: 100%; font-size:1.3rem; align-self: center;" id="label_cancion">Canción (mp3, mp4, ogg)</label>
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#A8A8A8" style="max-width: 100%; max-height: 100%; border-radius:50%; border: 2px solid #FFFFFF; width: 80%; height: 100%;">
     <path d="M0 0h24v24H0V0z" fill="none"></path>
     <path d="M7 18h2V6H7v12zm4 4h2V2h-2v20zm-8-8h2v-4H3v4zm12 4h2V6h-2v12zm4-8v4h2v-4h-2z"></path>
    </svg>
    <input type="file" id="file" accept="image/*" style="display:none">
    <label for="file" style="color:#121212; background-color:#FFFFFF; border-radius:500px; display: flex; align-items: center; cursor:pointer; padding: 8px 34px; letter-spacing: 1.76px; padding-top: 12px; padding-bottom: 12px; justify-content: center; width: 100%; max-width: 65%;" id="botonLabel_elegirCancion">
     <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#121212" style="padding-right: var(--lumo-space-s);">
      <path d="M0 0h24v24H0V0z" fill="none"></path>
      <path d="M20 2H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 14H8V4h12v12zm-7.5-1c1.38 0 2.5-1.12 2.5-2.5V7h3V5h-4v5.51c-.42-.32-.93-.51-1.5-.51-1.38 0-2.5 1.12-2.5 2.5s1.12 2.5 2.5 2.5zM4 6H2v14c0 1.1.9 2 2 2h14v-2H4V6z"></path>
     </svg>ELEGIR CANCIÓN</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <button style="width:100%; max-width: 17%; max-height: 8%; border:none; cursor:pointer; border-radius: 500px; color:#121212; padding: 8px 34px; font-weight:700; letter-spacing:1.76px; line-height:18px; background-color:#FFFFFF; align-self: center; margin-top: var(--lumo-space-xl); height: 100%; min-height: 8%;" id="button_modificarCancion" class="registro">MODIFICAR CANCIÓN</button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
