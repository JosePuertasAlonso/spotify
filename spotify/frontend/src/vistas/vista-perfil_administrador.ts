import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-perfil_administrador')
export class VistaPerfil_administrador extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    .label-lista label {
    	font-size: 1rem;
    	line-height: 1.5rem;
    	text-transform: none;
    	letter-spacing: normal;
    	font-weight: 700;

    }

    svg:hover {
    	fill:white;
    }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout class="content" style="background-color:#181818; width: 100%; height: 100%; align-items: center; justify-content: space-between; max-width: 100%; max-height: 100%;" id="vL_fondo">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; margin: 0px; max-width: 80%;" id="hL_imagenUsuario">
  <img style="max-height: 100%; max-width: 100%; margin: 0px;" id="imagen">
  <vaadin-vertical-layout class="label-lista" style="align-self: center; width: 100%; height: 100%; align-items: center; justify-content: center; flex-direction: column; display: flex; align-items: center;" id="vL_nombrePerfil">
   <label style="align-self: flex-start; color:#FFFFFF; width: 100%;" id="label_nombre">Usuario</label>
   <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="label_perfil">Perfil</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="height: 100%; justify-content: flex-end; align-items: center; margin-right: var(--lumo-space-xl);" id="hL_botones" class="label-lista">
  <button style="background:none; border:none; height: 30px; max-height: 30px; cursor: pointer; width: 30px; min-width: 30px; max-width: 30px; min-height: 30px; padding: 0px;" id="button_eliminar">
   <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#A8A8A8" style="width: 100%; height: 100%;">
    <path d="M0 0h24v24H0z" fill="none"></path>
    <path d="M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zM19 4h-3.5l-1-1h-5l-1 1H5v2h14V4z"></path>
   </svg></button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
