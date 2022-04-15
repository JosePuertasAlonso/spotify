import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-registrarse')
export class VistaRegistrarse extends LitElement {
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
<vaadin-vertical-layout class="fuentes" style="width: 100%; height: 100%; background-color:#121212; overflow-y:scroll;" id="vaadinVerticalLayout" theme="spacing" dir="vL_fondo">
 <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_creaCuenta">Crea una cuenta de Spotify</label>
 <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; max-width: 50%; align-self: center; margin-top: var(--lumo-space-xl);" id="hL_datosImagen">
  <vaadin-vertical-layout style="max-width: 70%; width: 100%; margin-right: var(--lumo-space-xl);" theme="spacing" id="vL_datos">
   <label style="flex-shrink: 0;" id="label_nombrePerfil">¿Cómo quieres que te llamemos?</label>
   <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorNombrePerfil">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
     <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
    </svg>El nombre de perfil introducido no es válido.</label>
   <input type="text" placeholder="Pon un nombre de perfil." style="width: 100%; padding: 10px;" id="input_nombrePerfil">
   <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_correo">¿Cuál es tu correo electrónico?</label>
   <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorCorreo">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
     <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
    </svg>El correo introducido ya está registrado.</label>
   <input type="email" placeholder="Pon tu correo electrónico." style="width: 100%; padding: 10px;" id="input_correo">
   <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_contrasena">Crea una contraseña</label>
   <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorContrasena">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
     <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
    </svg>La contraseña no cumple con los requisitos.</label>
   <input type="password" placeholder="Crea una contraseña." style="width: 100%; padding: 10px;" id="input_contrasena">
   <label style="flex-shrink: 0; margin-top: var(--lumo-space-l);" id="label_confirmarContrasena">Confirma la contraseña</label>
   <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 100%; max-width: 100%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);font-weight:400; font-size:1.1rem" id="label_errorConfirmarContrasena">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
     <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
    </svg>Las contraseñas no coinciden</label>
   <input type="password" placeholder="Vuelve a poner tu contraseña." style="width: 100%; padding: 10px;" id="input_confirmarContrasena">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing-l" class="botonlabel" style="max-width: 30%; width: 100%; align-items: center; align-self: flex-start; margin-top: var(--lumo-space-xl);" id="vL_imagen">
   <img style="max-width: 100%; max-height: 100%; border-radius:50%; border: 2px solid #FFFFFF;" src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/2048px-User-avatar.svg.png" id="imagen">
   <input type="file" id="file" accept="image/*" style="display:none">
   <label for="file" style="color:#121212; background-color:#FFFFFF; border-radius:500px; display: flex; align-items: center; cursor:pointer; font-size: 12px; padding: 8px 34px; letter-spacing: 1.76px; padding-top: 12px; padding-bottom: 12px; justify-content: center; width: 100%; max-width: 65%;" id="ButtonLabel_elegirFoto">
    <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#121212" style="padding-right: var(--lumo-space-s);">
     <path d="M0 0h24v24H0V0z" fill="none"></path>
     <path d="M18 20H4V6h9V4H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-9h-2v9zm-7.79-3.17l-1.96-2.36L5.5 18h11l-3.54-4.71zM20 4V1h-2v3h-3c.01.01 0 2 0 2h3v2.99c.01.01 2 0 2 0V6h3V4h-3z"></path>
    </svg>ELEGIR FOTO</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <button style="width:100%; max-width: 14%; max-height: 6.5%; border:none; cursor:pointer; border-radius: 500px; font-size:12px; color:#121212; padding: 8px 34px; font-weight:700; letter-spacing:1.76px; line-height:18px; align-self: center; margin-top: var(--lumo-space-l); height: 100%; min-height: 6.5%;" id="button_registrarse" class="registro">REGISTRARSE</button>
 <label style="align-self: center; margin-top: var(--lumo-space-l);" id="label_o">ó</label>
 <vaadin-horizontal-layout class="media-boton" theme="spacing-xl" style="align-self: center; margin-top: var(--lumo-space-l); flex-shrink: 0;" id="hL_GoogleAppleFacebook">
  <button style="min-width: 65px; min-height: 65px; max-width: 65px; max-height: 65px; flex-grow: 0; flex-shrink: 0; align-self: center; width: 65px; height: 65px; margin: 0px;" id="button_Google"><img style="width: 15; align-self: center;" src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Google_%22G%22_Logo.svg/1024px-Google_%22G%22_Logo.svg.png"></button>
  <button style="min-width: 65px; min-height: 65px; max-width: 65px; max-height: 65px; flex-grow: 0; flex-shrink: 0; padding: var(--lumo-space-m); align-self: center; background-color:#1C1C1C" id="button_Apple"><img style="min-width: 60px; width: 60px; height: 60px; min-height: 60px; max-height: 60px; max-width: 60px; border-radius:50px;" src="https://cdn3.iconfinder.com/data/icons/inficons/512/apple.png"></button>
  <button style="min-width: 65px; min-height: 65px; max-width: 65px; max-height: 65px; flex-grow: 0; flex-shrink: 0; padding: var(--lumo-space-m); align-self: center; background-color:#295396" id="button_Facebook"><img style="width: 15; min-width: 70px; max-width: 70px; min-height: 70px; max-height: 70px; border-radius:50px;" src="https://www.academiaaudioplace.com/wp-content/uploads/2017/10/facebook-icon-preview-200x200.png"></button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; margin-top: var(--lumo-space-xl); justify-content: center; margin-bottom: var(--lumo-space-xl);" id="hL_cuentaIniciar">
  <label style="font-size:1rem; text-align:right;" id="label_tienesCuenta">¿Ya tienes cuenta?</label>
  <button style="background:none; color:#1ED760; padding: 0px; text-align:center; text-decoration: underline; border:none; background:none; font-size:1.1rem; cursor: pointer; " id="button_iniciarSesion">Iniciar sesión</button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
