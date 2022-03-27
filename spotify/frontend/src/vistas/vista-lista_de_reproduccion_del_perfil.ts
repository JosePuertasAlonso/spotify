import { LitElement, html, css, customElement } from 'lit-element';
import './vista-lista_de_reproduccion_propia';

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
<vaadin-vertical-layout theme="spacing" style="background:#121212; width: 100%; height: 100%;" id="vL_contenedorListaReproduccionPropia">
 <vista-lista_de_reproduccion_propia style="width: 100%;" id="vistaLista_de_reproduccion_propia"></vista-lista_de_reproduccion_propia>
 <vista-lista_de_reproduccion_propia style="width: 100%;" id="vistaLista_de_reproduccion_propia1"></vista-lista_de_reproduccion_propia>
 <vista-lista_de_reproduccion_propia style="width: 100%;" id="vistaLista_de_reproduccion_propia2"></vista-lista_de_reproduccion_propia>
 <vista-lista_de_reproduccion_propia style="width: 100%;" id="vistaLista_de_reproduccion_propia3"></vista-lista_de_reproduccion_propia>
 <vista-lista_de_reproduccion_propia style="width: 100%;" id="vistaLista_de_reproduccion_propia4"></vista-lista_de_reproduccion_propia>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
