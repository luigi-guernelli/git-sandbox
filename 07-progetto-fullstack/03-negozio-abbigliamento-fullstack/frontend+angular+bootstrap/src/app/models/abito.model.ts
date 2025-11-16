export interface Abito {
  id?: number;
  tipo: string;             // "PANTALONE" | "CAMICIA" | "MAGLIONE" ...
  marca: string;
  taglia: string;
  prezzo: number;
  lunghezzaManica?: string; // per camicie
  materiale?: string;       // per maglioni/pantaloni
  fit?: string;             // per pantaloni
}
