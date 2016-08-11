
/**
 * 
 * Valida inclusões do lado do cliente
 * 
 * @param args
 * @returns
 */
function validarInclusaoDialog(args,id) {
	if (!args.validationFailed) {
		id.hide();
	}
	return false;
}