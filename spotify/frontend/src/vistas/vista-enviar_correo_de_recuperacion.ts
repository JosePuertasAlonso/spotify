import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera';

@customElement('vista-enviar_correo_de_recuperacion')
export class VistaEnviar_correo_de_recuperacion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color:#121212;" class="fuentes inicio-boton" theme="spacing" id="vL_fondo">
 <vista-cabecera style="width: 100%; max-height: 10%;" id="vistaCabecera"></vista-cabecera>
 <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_restablecerContrasena">Restablecer contraseña de Spotify</label>
 <label style="flex-shrink: 0; align-self: center; font-weight: 300; font-size:; max-width: 40%; text-align:center; margin-top: var(--lumo-space-xl);" id="label_envioEmail">Te hemos enviado un correo electrónico con instrucciones para volver a establecer tu contraseña.</label>
 <button id="button_aceptar" class="registro" style="margin-top: var(--lumo-space-xl); background-color:">ACEPTAR</button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
