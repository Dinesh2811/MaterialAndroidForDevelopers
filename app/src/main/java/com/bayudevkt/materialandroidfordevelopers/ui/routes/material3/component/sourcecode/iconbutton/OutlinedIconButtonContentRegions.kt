// This should not be edited instead you can always generate using `source_code_generator.js`.


 object OutlinedIconButtonContentSourceCode {
 
     val code get() = """
 
@Composable
fun OutlinedIconButtonContent(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedIconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "Location")
        }
        OutlinedIconButton(onClick = { /*TODO*/ }, enabled = false) {
            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "Location")
        }
    }
}

     """.trimIndent()
 }