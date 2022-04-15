import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-recuperar_contrasena')
export class VistaRecuperar_contrasena extends LitElement {
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

    .inicio-boton button {
    	width:100%; 
    	max-width: 14%; 
    	max-height: 6.5%; 
    	border:none; 
    	cursor:pointer; 
    	border-radius: 500px; 
    	font-size:12px; 
    	color:#121212; 
    	padding: 8px 34px; 
    	font-weight:700; 
    	letter-spacing:1.76px; 
    	line-height:18px; 
    	background-color:#FFFFFF; 
    	align-self: center; 
    	margin-top: var(--lumo-space-l); 
    	height: 100%; 
    	min-height: 6.5%;
    }

    .inicio-boton button:hover {
    	font-size:13px; 
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
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color:#121212;" class="fuentes botones-cabecera" theme="spacing" id="vL_fondo">
 <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_nuevaContrasena">Restablecer contraseña de Spotify</label>
 <label style="flex-shrink: 0; align-self: center; font-weight: 300; max-width: 40%; text-align:center; margin-top: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xl);" id="label_instrucciones">Introduce el email que usaste para registrarte. Te enviaremos un correo electrónico con un enlace para restablecer la contraseña.</label>
 <label style="flex-shrink: 0; align-self: center; text-align:center; display: flex; align-items: center; background-color:#E91429; width: 100%; justify-content: center; min-width: 31%; max-width: 31%; padding-right: 10px; padding-left: 10px; margin-left: var(--lumo-space-l); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs); font-weight:400; font-size:1.1rem;" id="label_errorCorreo">
  <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#FFFFFF" style="margin-right: var(--lumo-space-s);">
   <path d="M11 15h2v2h-2v-2zm0-8h2v6h-2V7zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"></path>
  </svg>Dirección de correo no registrado.</label>
 <label style="flex-shrink: 0; max-width: 31%; min-width: 31%; width: 100%; align-self: center;" id="label_correo">Dirección de correo electrónico</label>
 <input type="email" placeholder="Dirección de correo electrónico" style="padding: 10px; width: 100%; min-width: 31%; max-width: 31%; align-self: center; margin-left: var(--lumo-space-l);" id="input_correo">
 <button id="button_enviarCorreo" class="registro" style="margin-top: var(--lumo-space-xl); color:#000000; background-color:#FFFFFF; max-height: 7%; max-width: 14%;">ENVIAR CORREO</button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
