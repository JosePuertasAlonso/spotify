import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-lista_de_reproduccion_del_perfil')
export class VistaLista_de_reproduccion_del_perfil extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }


      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing" style="background:#121212; width: 100%; height: 100%;" id="vL_contenedorListaReproduccionPropia"></vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
