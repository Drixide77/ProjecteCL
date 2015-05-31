func equals(a, b)
	return a = b;
endfunc

func main()
	write "rSet Test: ";
	rSet(0,0,90);
	write "rMove Test:";
	rMove(1.0);
  write "Test de Strings: ";
  s = "potato";
  f = 1.0;
  f2 = 2.9;
  f3 = 2.0;
  f4 = f * f2 / f3;
  write f4;
  write 12 % 7;
  n = "potato";
  m = n;
  write m;
  if equals(s, m) then write "GLaDoS" endif;
  write "Solucio: ";
  write s;
endfunc
