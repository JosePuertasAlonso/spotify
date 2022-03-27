import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-confirmar_registro')
export class VistaConfirmar_registro extends LitElement {
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




      `;
  }

  render() {
    return html`
<vaadin-vertical-layout class="fuentes inicio-boton" style="width: 100%; height: 100%; background-color:#121212;" id="vL_fondo" theme="spacing">
 <vista-cabecera style="width: 100%; max-height: 10%;" id="vistaCabecera"></vista-cabecera>
 <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_graciasPorRegistrarte">¡Gracias por registrarte!</label>
 <label style="flex-shrink: 0; align-self: center; margin-top: var(--lumo-space-xl);" id="label_envioEmail">Te hemos enviado un email con un enlace para confirmar tu cuenta.</label>
 <label style="flex-shrink: 0; align-self: center; font-weight: 300; font-size:" id="label_revisaEmail">Por favor, revisa tu email y haz click en el enlace para empezar a usar Spotify.</label>
 <button id="button_iniciarSesion" class="registro">INICIAR SESIÓN</button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
