import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera';
import './vista-reproductor_resumido';

@customElement('vista-crear_lista_de_reproduccion')
export class VistaCrear_lista_de_reproduccion extends LitElement {
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

    button{
    	font-size:12px
    }

    button:hover{
    	font-size: 13px;
    }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="background:#121212; max-width: 100%; max-height: 100%; align-items: flex-start; height: 100%;" class="fuentes" id="vL_fondo">
 <vista-cabecera style="width: 100%; height: 10%;" id="vistaCabecera"></vista-cabecera>
 <vaadin-vertical-layout theme="spacing" style="max-height: 80%; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); height: 100%; width: 100%; max-width: 40%; align-self: center;" id="vL_cuerpo">
  <label style="align-self: center; font-size: 2.5rem; text-align: center;" id="label_creaLista">Crea una lista de reproducción</label>
  <label style="flex-shrink: 0;" id="label_titulo">Ponle un título a la lista de reproducción</label>
  <input type="email" placeholder="Pon el título de la lista de reproducción" style="width: 100%; padding: 10px;" id="input_titulo">
  <button style="width:100%; max-width: 40%; max-height: 8%; border:none; cursor:pointer; border-radius: 500px; color:#121212; padding: 8px 34px; font-weight:700; letter-spacing:1.76px; line-height:18px; background-color:#FFFFFF; align-self: center; margin-top: var(--lumo-space-xl); height: 100%; min-height: 8%;" id="button_crearLista" class="registro">CREAR LISTA</button>
 </vaadin-vertical-layout>
 <vista-reproductor_resumido style="width: 100%; height: 10%;" id="vistaReproductor_resumido"></vista-reproductor_resumido>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
