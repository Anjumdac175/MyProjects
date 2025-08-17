using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace BookEFC.Models;

public partial class Book
{
    [Key]
    [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
    public int BookId { get; set; }

    public string? Title { get; set; }

    public string? Author { get; set; }

    public decimal Price { get; set; }

    public int PublisherId { get; set; }

    public virtual Publisher? Publisher { get; set; }
}
