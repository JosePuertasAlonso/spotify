import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-dar_de_alta_artista')
export class VistaDar_de_alta_artista extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    ::-webkit-scrollbar {
		width: 8px;
    }

    ::-webkit-scrollbar-thumb {
		background: #414141;
		background: #A8A8A8;
		border-radius: 5px;
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

    .botonlabel label {
    	font-size:12px;
    }

    .botonlabel label:hover {
    	font-size:13px;
    }

    .fuentes input::placeholder {
    	color:#A8A8A8;
    }

    button {
    	font-size:12px;
    }

    button:hover {
    	font-size:13px;
    }


      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color:#121212; overflow-y:scroll;" class="fuentes botones-cabecera" theme="spacing" id="vL_fondo">
 <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_anadeArtista">Añade un nuevo artista</label>
 <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; max-width: 50%; align-self: center; margin-top: var(--lumo-space-xl); max-height: 90%;" id="hL_datosImagen">
  <vaadin-vertical-layout style="max-width: 70%; margin-right: var(--lumo-space-xl); margin-bottom: 0px; width: 100%;" theme="spacing" id="vL_datos">
   <label style="flex-shrink: 0;" id="label_nombre">¿Cómo se llama el artista?</label>
   <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorNombre">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
     <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
    </svg>El nombre de perfil introducido no es válido.</label>
   <input type="text" placeholder="Pon un nombre de perfil al artista." style="width: 100%; padding: 10px;" id="input_nombre">
   <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_correo">¿Cuál es el correo electrónico del artista?</label>
   <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorCorreo">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
     <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
    </svg>El correo introducido ya está registrado.</label>
   <input type="email" placeholder="Pon el correo electrónico del artista." style="width: 100%; padding: 10px;" id="input_correo">
   <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_contrasena">Crea una contraseña para el artista</label>
   <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorContrasena">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
     <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
    </svg>La contraseña no cumple con los requisitos.</label>
   <input type="password" placeholder="Crea una contraseña para el artista." style="width: 100%; padding: 10px;" id="input_contrasena">
   <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_estilos">Estilos del artista:</label>
   <vaadin-horizontal-layout theme="spacing" style="width: 105%; overflow-y:scroll; max-height: 30%; padding: 0px; border: 1px solid #FFFFFF; margin-bottom: 0px; height: 100%;" id="hL_estilos"></vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing-l" class="botonlabel" style="max-width: 30%; width: 100%; align-items: center; align-self: flex-start; margin-top: var(--lumo-space-xl);" id="vL_imagen">
   <img style="max-width: 100%; max-height: 100%; border-radius:50%; border: 2px solid #FFFFFF;" src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/2048px-User-avatar.svg.png" id="imagen">
   <input type="file" id="file" accept="image/*" style="display:none">
   <label for="file" style="color:#121212; background-color:#FFFFFF; border-radius:500px; display: flex; align-items: center; cursor:pointer; padding: 8px 34px; letter-spacing: 1.76px; padding-top: 12px; padding-bottom: 12px; justify-content: center; width: 100%; max-width: 65%;" id="buttonLabel_elegirFoto">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#121212" style="padding-right: var(--lumo-space-s);">
     <path d="M0 0h24v24H0V0z" fill="none"></path>
     <path d="M18 20H4V6h9V4H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-9h-2v9zm-7.79-3.17l-1.96-2.36L5.5 18h11l-3.54-4.71zM20 4V1h-2v3h-3c.01.01 0 2 0 2h3v2.99c.01.01 2 0 2 0V6h3V4h-3z"></path>
    </svg>ELEGIR FOTO</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <button style="color:#000000; background-color:#FFFFFF; margin-bottom: var(--lumo-space-xl); max-width: 15%; height: 7%; min-height: 7%; max-height: 7%;" id="button_anadirArtista" class="registro">AÑADIR ARTISTA</button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
