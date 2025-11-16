export interface Abito {
  id?: number;
  tipo: string;       // "PANTALONE" | "CAMICIA" | "MAGLIONE"
  marca: string;
  taglia: string;
  prezzo: number;
  fit?: string;
  lunghezzaManica?: string;
  materiale?: string;
}
