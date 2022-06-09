import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color:#121212; overflow-y:scroll" class="fuentes" id="vL_fondo">
 <vaadin-vertical-layout theme="spacing" style="max-height: 100%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); height: 100%; width: 100%; margin-left: 0px; overflow-y:scroll" id="vL_cuerpo" class="botones-cabecera">
  <label style="align-self: center; font-size: 2.5rem; text-align: center; margin-left: -75px;" id="label_anadeNuevaCancion">Añade una nueva canción</label>
  <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; padding-right: 10px; padding-left: 10px; padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs); font-weight:400; font-size:1.1rem; max-width: 41%; margin-left: -65px;" id="label_errorFicheroCancion">
   <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
    <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
   </svg>Debe seleccionar un fichero para la canción</label>
  <vaadin-horizontal-layout theme="spacing-xl" style="max-width: 80%; align-self: center; margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); width: 100%; margin-left: -20px; align-items: flex-start; justify-content: center; flex-grow: 0; flex-shrink: 0;" id="hL_datosCancion">
   <vaadin-vertical-layout theme="spacing-l" class="botonlabel" style="max-width: 15%; width: 100%; align-items: center; align-self: flex-start; margin-left: 0px; margin-right: var(--lumo-space-xl); justify-content: flex-start; margin-top: 20px;" id="vL_imagen">
    <img style="max-width: 100%; max-height: 100%; border-radius:50%; border: 2px solid #FFFFFF;" id="imagen">
    <span class="input_file" id="span"><input type="file" name="input_file" id="input_file" style="display:none" accept="image/*"></span>
    <label for="input_file" id="labelinput_file" style="color:#121212; background-color:#FFFFFF; border-radius:500px; display: flex; align-items: center; cursor:pointer; padding: 8px 34px; letter-spacing: 1.76px; padding-top: 12px; padding-bottom: 12px; justify-content: center; width: 100%; margin-top: var(--lumo-space-xs);">
     <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#121212" style="padding-right: var(--lumo-space-s);">
      <path d="M0 0h24v24H0V0z" fill="none"></path>
      <path d="M18 20H4V6h9V4H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-9h-2v9zm-7.79-3.17l-1.96-2.36L5.5 18h11l-3.54-4.71zM20 4V1h-2v3h-3c.01.01 0 2 0 2h3v2.99c.01.01 2 0 2 0V6h3V4h-3z"></path>
     </svg><span id="span1">ELEGIR FOTO</span></label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="max-width: 70%; width: 100%; margin-right: var(--lumo-space-xl);" theme="spacing" id="vL_cancion">
    <label style="flex-shrink: 0;" id="label_titulo">Título de la canción</label>
    <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorTitulo">
     <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
      <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
     </svg>Titulo de la canción incorrecto</label>
    <input type="email" placeholder="Pon un título a la canción." style="padding: 10px; width: 100%;" id="input_titulo">
    <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_artista">Artista(s) de la canción</label>
    <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorArtistas">
     <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
      <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
     </svg>Artistas para la canción incorrectos</label>
    <input type="email" placeholder="Pon el artista(s) de la canción." style="width: 100%; padding: 10px;" id="input_artista">
    <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_compositores">Compositores de la canción</label>
    <input type="email" placeholder="Pon los compositores la canción." style="padding: 10px; width: 100%;" id="input_compositores">
    <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_interpretes">Intérpretes de la canción</label>
    <input type="email" placeholder="Pon los intérpretes de la canción." style="padding: 10px; width: 100%;" id="input_interpretes">
    <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_productores">Productores de la canción</label>
    <input type="email" placeholder="Pon los productores de la canción." style="padding: 10px; width: 100%;" id="input_productores">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing-l" class="botonlabel" style="max-width: 20%; width: 100%; align-items: center; max-height: 100%; justify-content: flex-start;" id="vL_cancion1">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#A8A8A8" style="max-width: 100%; max-height: 100%; border-radius:50%; border: 2px solid #FFFFFF; width: 80%; height: 100%;">
     <path d="M0 0h24v24H0V0z" fill="none"></path>
     <path d="M7 18h2V6H7v12zm4 4h2V2h-2v20zm-8-8h2v-4H3v4zm12 4h2V6h-2v12zm4-8v4h2v-4h-2z"></path>
    </svg>
    <span class="input_audio" id="span_audio"><input type="file" name="input_audio" id="input_audio" style="display:none" accept="audio/*"></span>
    <label for="input_audio" id="labelinput_audio" style="color:#121212; background-color:#FFFFFF; border-radius:500px; display: flex; align-items: center; cursor:pointer; padding: 8px 34px; letter-spacing: 1.76px; padding-top: 12px; padding-bottom: 12px; justify-content: center; width: 100%; margin-top: var(--lumo-space-xs);">
     <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#121212" style="padding-right: var(--lumo-space-s);">
      <path d="M0 0h24v24H0V0z" fill="none"></path>
      <path d="M18 20H4V6h9V4H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-9h-2v9zm-7.79-3.17l-1.96-2.36L5.5 18h11l-3.54-4.71zM20 4V1h-2v3h-3c.01.01 0 2 0 2h3v2.99c.01.01 2 0 2 0V6h3V4h-3z"></path>
     </svg><span>ELEGIR CANCIÓN</span></label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <button style="color:#000000; background-color:#FFFFFF; max-height: 50px; max-width: 17%; margin-top: var(--lumo-space-l); height: 50px; min-height: 50px;" id="button_modificarCancion" class="registro">MODIFICAR CANCIÓN</button>
  <button style="color:#000000; background-color:#FFFFFF; max-height: 50px; max-width: 17%; margin-top: var(--lumo-space-l); height: 50px; min-height: 50px;" id="button_anadirCancion" class="registro">AÑADIR CANCIÓN</button>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="height: 50px; width: 100%; min-height: 50px; max-height: 50px;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
