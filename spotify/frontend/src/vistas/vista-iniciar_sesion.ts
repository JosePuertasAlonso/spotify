import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-iniciar_sesion')
export class VistaIniciar_sesion extends LitElement {
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

    .fuentes input::placeholder {
    	color:#A8A8A8;
    }

    .inicio-boton button {
    	width:100%; 
    	border:none; 
    	cursor:pointer; 
    	border-radius: 500px; 
    	font-size:12px; 
    	color:#121212; 
    	padding: 8px 34px; 
    	font-weight:700; 
    	letter-spacing:1.76px; 
    	line-height:18px; 
    	background-color:#1ED760; 
    	align-self: center; 
    	margin-top: var(--lumo-space-l); 
    	height: 100%; 
    	max-width: 43%; 
    	min-height: 15%; 
    	max-height: 15%;
    }

    .inicio-boton button:hover {
    	font-size:13px; 
    }

    .media-boton button {
    	border:none; 
    	background:none;
    	cursor: pointer; 
    	border-radius: 50%;
    	align-self: center;
    	background-color: #FFFFFF;
    	display: flex;
    	align-items: center;
    	align: center;
    	padding: 0px 0px;
    	justify-content: center;
    }

    .media-boton button img {
    	min-width: 35px; 
    	min-height: 35px; 
    	max-width: 35px; 
    	max-height: 35px
    }


      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color:#121212; overflow-y:scroll;" class="fuentes" theme="spacing" id="vL_fondo">
 <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_iniciarSesion">Inicia sesión en Spotify</label>
 <vaadin-vertical-layout style="max-width: 31%; width: 100%; align-self: center;" theme="spacing" class="inicio-boton" id="vL_datosInicioSesion">
  <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorInicioSesion">
   <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
    <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
   </svg>Dirección de correo o contraseña incorrectos.</label>
  <label style="flex-shrink: 0;" id="label_correoElectronico">Dirección de correo electrónico</label>
  <input type="email" placeholder="Dirección de correo electrónico" style="padding: 10px; width: 100%;" id="input_correoElectronico">
  <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_contrasena">Contraseña</label>
  <input type="password" placeholder="Contraseña" style="width: 100%; padding: 10px;" id="input_contrasena">
  <button style="background:none; color:#1ED760; padding: 0px; text-align:left; text-decoration: underline; border:none; background:none; font-size:1.1rem; cursor: pointer; width: 100%; border-radius: 0px; font-weight:400; letter-spacing:0px; max-width: 100%; min-height: 0%; align-self: flex-start; margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-xs);" id="button_recordarContrasena">¿Se te ha olvidado la contraseña?</button>
  <button id="button_iniciarSesion" class="registro" style="margin-top: var(--lumo-space-xl);">INICIAR SESIÓN</button>
 </vaadin-vertical-layout>
 <label style="align-self: center; margin-top: var(--lumo-space-l);" id="label_o">ó</label>
 <vaadin-horizontal-layout class="media-boton" theme="spacing-xl" style="align-self: center; margin-top: var(--lumo-space-l); flex-shrink: 0;" id="hL_GoogleAppleFacebook">
  <button style="min-width: 65px; min-height: 65px; max-width: 65px; max-height: 65px; flex-grow: 0; flex-shrink: 0; align-self: center; width: 65px; height: 65px; margin: 0px;" id="button_Google"><img style="width: 15; align-self: center;" src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Google_%22G%22_Logo.svg/1024px-Google_%22G%22_Logo.svg.png" id="img"></button>
  <button style="min-width: 65px; min-height: 65px; max-width: 65px; max-height: 65px; flex-grow: 0; flex-shrink: 0; padding: var(--lumo-space-m); align-self: center; background-color:#1C1C1C" id="button_Apple"><img style="min-width: 60px; width: 60px; height: 60px; min-height: 60px; max-height: 60px; max-width: 60px; border-radius:50px;" src="https://cdn3.iconfinder.com/data/icons/inficons/512/apple.png" id="img1"></button>
  <button style="min-width: 65px; min-height: 65px; max-width: 65px; max-height: 65px; flex-grow: 0; flex-shrink: 0; padding: var(--lumo-space-m); align-self: center; background-color:#295396" id="button_Facebook"><img style="width: 15; min-width: 70px; max-width: 70px; min-height: 70px; max-height: 70px; border-radius:50px;" src="https://www.academiaaudioplace.com/wp-content/uploads/2017/10/facebook-icon-preview-200x200.png" id="img2"></button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; margin-top: var(--lumo-space-xl); justify-content: center; margin-bottom: var(--lumo-space-xl);" id="hL_miembroSuscribete">
  <label style="font-size:1.1rem; text-align:right;" id="label_noMiembro">¿No eres miembro?</label>
  <button style="background:none; color:#1ED760; padding: 0px; text-align:center; text-decoration: underline; border:none; background:none; font-size:1.1rem; cursor: pointer; " id="button_suscribete">Suscríbete a Spotify</button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
