// This should not be edited instead you can always generate using `source_code_generator.js`.


 object LargeTopAppBarContentSourceCode {
 
     val code get() = """
 
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LargeTopAppBarContent(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp), contentAlignment = Alignment.Center
    ) {
        LargeTopAppBar(
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = null)
                }
            },
            title = {
                Text(text = "TopAppBar")
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Edit, contentDescription = null)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Save, contentDescription = null)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
                }
            }
        )
    }
}

     """.trimIndent()
 }