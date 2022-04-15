import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-cabecera')
export class VistaCabecera extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      

      .botones-cabecera button {
    		width: 100%; 
    		height: 100%; 
    		border:none; 
    		background:none;
    		cursor: pointer; 
    		border-radius: 500px; 
    		font-size: 12px; 
    		color: #FFFFFF;
    		max-width: 50%; 
    		padding: 8px 34px;
    		align-self: center;
    		font-weight: 700;
    		letter-spacing: 1.76px;
    		line-height: 18px;
    		background-color: #000000;

      }

      .botones-cabecera button:hover {
    		font-size: 13px;

      }

      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; background-color: #000000; padding-bottom: var(--lumo-space-m); padding-top: var(--lumo-space-m); justify-content: space-between; padding: var(--lumo-space-m);" id="hL_fondo">
 <vaadin-horizontal-layout id="hL_Logo" style="height: 100%; flex-shrink: 1; flex-grow: 0; max-width: 13%; width: 100%; align-items: center; justify-content: flex-start; margin: 0px;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout class="botones-cabecera" style="flex-shrink: 0; flex-grow: 0; width: 100%; height: 100%; align-items: center; justify-content: space-around; max-width: 32%; align: left; align-self: center;" id="hL_usuarioCerrarSesion">
  <vaadin-horizontal-layout style="width: 100%; height: 100%; border:none; background:none; cursor: pointer; border-radius: 500px; color: #FFFFFF; max-width: 50%; padding: 8px 34px; align-self: center; background-color: #000000; align-items: center; justify-content: center; flex-shrink: 0; flex-direction: row;" id="hL_fotoNombreUsuario" theme="spacing">
   <img style="max-height: 100%; align-self: center; cursor: pointer; max-width: 100%; flex-shrink: 0;" src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/2048px-User-avatar.svg.png" id="foto">
   <label id="label_nombreUsuario" style="color: white; font-size:0.875rem; line-height:1rem; letter-spacing: normal; font-weight: 700; cursor: pointer; flex-shrink: 1; align-self: center; display: flex; flex-grow: 0; flex-direction: column; align-items: flex-start; justify-content: center; max-width: 100%; max-height: 100%;">usuario</label>
  </vaadin-horizontal-layout>
  <button style="background-color:#FFFFFF; color: black" id="button_cerrarSesion">CERRAR SESIÓN</button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout class="botones-cabecera" style="flex-shrink: 0; flex-grow: 0; width: 100%; height: 100%; align-items: center; justify-content: space-around; max-width: 30%; align: left; align-self: center;" id="hL_registrarseIniciarSesion">
  <button id="button_registrarse">REGISTRARSE</button>
  <button style="background-color: #FFFFFF; color: black" id="button_iniciarSesion">INICIAR SESIÓN</button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
