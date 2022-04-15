import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-lista_de_reproduccion_lista')
export class VistaLista_de_reproduccion_lista extends LitElement {
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
<vaadin-horizontal-layout class="content" style="background-color:#181818; width: 100%; height: 100%; align-items: center; justify-content: space-between; max-width: 100%; max-height: 100%;" id="hL_fondo">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; margin: 0px;" id="hL_imagenTitulo">
  <img style="max-height: 100%; max-width: 100%; margin: 0px;" src="https://i.scdn.co/image/ab67706f00000003a0f40d75f093bb6814fcd53e
" id="imagen">
  <vaadin-vertical-layout class="label-lista" style="align-self: center; width: 100%; height: 100%; align-items: center; justify-content: center; flex-direction: column; display: flex; align-items: center;" id="vL_tituloCreador">
   <label style="align-self: flex-start; color:#FFFFFF; width: 100%;" id="label_titulo">Pop con Ñ Clásicos</label>
   <label style="align-self: flex-start; color:#9D9D9D; font-weight: 400; width: 100%;" id="label_creador">Creador</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing-l" style="height: 100%; justify-content: flex-end; align-items: center; margin-right: var(--lumo-space-xl);" id="hL_botones" class="label-lista">
  <button style="background:none; border:none; height: 2.3rem; cursor: pointer; padding: 0px; width: 2.3rem; min-width: 2.3rem; max-width: 2.3rem; min-height: 2.3rem; max-height: 2.3rem;" id="button_guardar">
   <svg xmlns="http://www.w3.org/2000/svg" height="24px" viewbox="0 0 24 24" width="24px" fill="#A8A8A8" style="width: 100%; height: 100%;">
    <path d="M0 0h24v24H0z" fill="none" style="width: 100%; height: 100%;"></path>
    <path d="M19 9h-4V3H9v6H5l7 7 7-7zM5 18v2h14v-2H5z"></path>
   </svg></button>
  <button style="border:none; height: 2.3rem; width: 2.3rem; border:none; align-self: center; flex-grow: 0; cursor: pointer; background-color: #1ED760; border-radius: 50%; padding: var(--lumo-space-s); min-height: 2.3rem; min-width: 2.3rem; max-width: 2.3rem; max-height: 2.3rem;" id="button_play">
   <svg role="img" height="" width="" viewbox="0 0 24 24" class="Svg-sc-1bi12j5-0 hDgDGI" style="width: 100%; height: 100%; max-width: 100%; max-height: 100%; min-width: 100%; min-height: 100%; text-align;center; display: flex; align-items: center;">
    <path d="M7.05 3.606l13.49 7.788a.7.7 0 010 1.212L7.05 20.394A.7.7 0 016 19.788V4.212a.7.7 0 011.05-.606z"></path>
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
